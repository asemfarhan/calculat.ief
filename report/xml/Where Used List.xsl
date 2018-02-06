<?xml version="1.0" encoding = "ISO-8859-15" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="varModelName">Model Name: </xsl:variable>
  <xsl:variable name="varSubset">Subset: </xsl:variable>
  <xsl:variable name="varEndOfReport">*** End of report ***</xsl:variable>
  <xsl:variable name="varattr">attribute</xsl:variable>
  <xsl:variable name="varent">entity</xsl:variable>
  <xsl:variable name="varworkset">work set</xsl:variable>
  <xsl:variable name="varsubtype">subtype</xsl:variable>
  <xsl:variable name="varisusedby">is used by:</xsl:variable>
  <xsl:variable name="varBAAActionBlockColon">BAA Action Block:</xsl:variable>
  <xsl:variable name="varBSDActionBlockColon">BSD Action Block:</xsl:variable>
  <xsl:variable name="varProcedureStepColon">Procedure Step:</xsl:variable>
  <xsl:variable name="varProcessColon">Process:</xsl:variable>
  <xsl:variable name="varCommandColon">Command:</xsl:variable>
  <xsl:variable name="varMenuItemColon">Menu Item:</xsl:variable>
  <xsl:variable name="varFlowfrom">Flow from</xsl:variable>
  <xsl:variable name="varReturnfrom">Return from</xsl:variable>
  <xsl:variable name="varPushButtonColon">Push Button:</xsl:variable>
  <xsl:variable name="varDialect">Dialect</xsl:variable>
  <xsl:variable name="varWindowColon">Window:</xsl:variable>
  <xsl:variable name="varDialogColon">Dialog:</xsl:variable>
  <xsl:variable name="varto">to</xsl:variable>
  <xsl:variable name="varobject">object</xsl:variable>
  <xsl:variable name="varisusedinmatrixColon">is used in matrix(es):</xsl:variable>
  <xsl:variable name="varRelationship">Relationship</xsl:variable>

  <xsl:template match="/">
      
   <DIV STYLE="background-color:white; font-size: 10pt">
	<h1 style="left:100; position:relative">
		<xsl:value-of select="Report/title"/></h1>
	<h3><xsl:copy-of select="$varModelName" /><span style="left:20; position:relative"><xsl:value-of select="Report/modelname"/></span></h3>
	<h3><xsl:copy-of select="$varSubset" /><span style="left:20; position:relative"><xsl:value-of select="Report/subset"/></span></h3>
	<h3><xsl:value-of select="Report/datetime"/></h3>
	<h3></h3>
	<h3></h3>
     <xsl:apply-templates select="Report"/>
   	<b style="left:100; position:relative"><xsl:copy-of select="$varEndOfReport" /></b>
   </DIV>

  </xsl:template>
  
  <xsl:template name="DisplayUsedBy">
	<xsl:param name="type" />
	<ul style="left:10; position:relative"><xsl:value-of select="$type" />
		<span style="left:20; position:relative"><b><xsl:value-of select="@NAME" /></b></span>
		<span style="left:30; position:relative"><xsl:copy-of select="$varisusedby" /></span>
    <xsl:apply-templates select="TACBLKBA" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TACBLKBS" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TBUSPRST" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TPRCDF" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
	</ul>
  </xsl:template>

  <xsl:template match="Report">
	<xsl:for-each select="THLENT">
		<xsl:call-template name="DisplayUsedBy">
			<xsl:with-param name="type"><xsl:copy-of select="$varent" /></xsl:with-param>
		</xsl:call-template>
	</xsl:for-each>
	<xsl:for-each select="THLENTDS">
		<xsl:call-template name="DisplayUsedBy">
			<xsl:with-param name="type"><xsl:copy-of select="$varworkset" /></xsl:with-param>
		</xsl:call-template>
	</xsl:for-each>
	<xsl:for-each select="TENTSU">
		<xsl:call-template name="DisplayUsedBy">
			<xsl:with-param name="type"><xsl:copy-of select="$varsubtype" /></xsl:with-param>
		</xsl:call-template>
	</xsl:for-each>
	<xsl:for-each select="TATTRUSR">
		<xsl:call-template name="DisplayUsedBy">
			<xsl:with-param name="type"><xsl:copy-of select="$varattr" /></xsl:with-param>
		</xsl:call-template>
	</xsl:for-each>
	
	<xsl:apply-templates select="TCOMMAND" />
	
	<xsl:for-each select="TDIALECT">
		<span style="left:0; position:relative"><xsl:copy-of select="$varDialect" /></span>
			<span style="left:10; position:relative"><b><xsl:value-of select="@NAME" /></b></span>
			<span style="left:20; position:relative"><xsl:copy-of select="$varisusedby" /></span><BR></BR>
			<xsl:apply-templates select="TWINPRIM"/>
			<xsl:apply-templates select="TDLGBOX"/>
	</xsl:for-each>

	<xsl:apply-templates select="TEXSTATE" />

	<xsl:apply-templates select="TGENCLAS" />
	
	<xsl:for-each select="TRELMM">
		<xsl:call-template name="DisplayUsedBy">
			<xsl:with-param name="type"><xsl:copy-of select="$varRelationship" /></xsl:with-param>
		</xsl:call-template>
	</xsl:for-each>
  </xsl:template>

  <xsl:template match="TACBLKBA">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varBAAActionBlockColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>
  
  <xsl:template match="TACBLKBS">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varBSDActionBlockColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>
  
  <xsl:template match="TBUSPRST">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varProcedureStepColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>
  
  <xsl:template match="TPRCDF">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varProcessColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>

  <xsl:template match="TCOMMAND">
	<ul style="left:20; position:relative"><b><xsl:copy-of select="$varCommandColon" /></b>
		<span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		<span style="left:40; position:relative"><b><xsl:copy-of select="$varisusedby" /></b></span>
		<xsl:apply-templates select="TDLGFLOW/INITBY" />
		<xsl:apply-templates select="TMENUITE" />
    <xsl:apply-templates select="TBUSPRST" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
		<xsl:apply-templates select="TPUSHBTN" />
		<xsl:apply-templates select="TDLGFLOW/INITS" />
	</ul>
  </xsl:template>

  <xsl:template match="TDLGFLOW/INITBY">
	<ul style="left:20; position:relative"><b><xsl:copy-of select="$varFlowfrom" /></b>
		<span style="left:40; position:relative"><xsl:value-of select="TBUSPRST/@NAME" /></span>
		<span style="left:60; position:relative"><b><xsl:copy-of select="$varto" /></b></span>
        <span style="left:100; position:relative"><xsl:value-of select="INITS/TBUSPRST/@NAME" /></span>
	</ul>
  </xsl:template>
  
  <xsl:template match="TDLGFLOW/INITS">
	<ul style="left:20; position:relative"><b><xsl:copy-of select="$varReturnfrom" /></b>
		<span style="left:40; position:relative"><xsl:value-of select="TBUSPRST/@NAME" /></span>
		<span style="left:60; position:relative"><b><xsl:copy-of select="$varto" /></b></span>
        <span style="left:100; position:relative"><xsl:value-of select="INITBY/TBUSPRST/@NAME" /></span>
	</ul>
  </xsl:template>
  
  <xsl:template match="TMENUITE">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varMenuItemColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>
  
  <xsl:template match="TPUSHBTN">
		<ul style="left:20; position:relative"><b><xsl:copy-of select="$varPushButtonColon" /></b>
	          <span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		</ul>
  </xsl:template>
  
  <xsl:template match="TWINPRIM">
	<ul style="left:30; position:relative"><xsl:copy-of select="$varWindowColon" />
	    <span style="left:120; position:absolute"><b><xsl:value-of select="@NAME" /></b></span>
	</ul>
  </xsl:template>
  
  <xsl:template match="TDLGBOX">
	<ul style="left:30; position:relative"><xsl:copy-of select="$varDialogColon" />
	    <span style="left:120; position:absolute"><b><xsl:value-of select="@NAME" /></b></span>
	</ul>
  </xsl:template>
  
  <xsl:template match="TEXSTATE">
	<ul style="left:20; position:relative"><b>Exit State</b>
		<span style="left:40; position:relative"><xsl:value-of select="@NAME" /></span>
		<span style="left:60; position:relative"><b>is used by:</b></span>
		<xsl:apply-templates select="TDLGFLOW/INITBY" />
    <!-- ASB 14680487. Added sort below -->
    <xsl:apply-templates select="TACBLKBA" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TACBLKBS" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TBUSPRST" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
    <xsl:apply-templates select="TPRCDF" >
      <xsl:sort select="@*[local-name()]"/>
    </xsl:apply-templates>
		<xsl:apply-templates select="TDLGFLOW/INITS" />
	</ul>
  </xsl:template>
  
  <xsl:template match="TGENCLAS">
	<ul style="left:10; position:relative"><b><xsl:copy-of select="$varobject" /></b>
		<span style="left:20; position:relative"><xsl:value-of select="@NAME" /></span>
		<span style="left:30; position:relative"><b><xsl:copy-of select="$varisusedinmatrixColon" /></b></span>
		<xsl:apply-templates select="TMATRIX" />
	</ul>
  </xsl:template>

  <xsl:template match="TMATRIX">
	<ul style="left:40; position:relative"><xsl:value-of select="@NAME" />
	</ul>
  </xsl:template>

</xsl:stylesheet>
