//-- CA Gen 8.6 - File Name: CALCULAT_WIN.js - generated on 2017/04/09 (98) at 22:59:12   -- 
   
 var ie4 = false; 
 var ns4 = false; 
 var ns6 = false; 
 if ((navigator.userAgent.indexOf("Trident") != -1) || (navigator.appName.indexOf("Internet Explorer") != -1)) { 
    ie4 = true; 
 } else { 
    ns4 = ((navigator.appName.indexOf("Netscape") != -1) && (navigator.appVersion.substring(0,1) <= 4)); 
    ns6 = ((navigator.appName.indexOf("Netscape") != -1) && (navigator.appVersion.substring(0,1) > 4)); 
 } 
 if (ns4) 
    alert('Netscape 4.7 is not supported by this application'); 
   
 var oleResult; 
 var oleIndex = 0; 
 var dataPasted=false;
                                
   
function onkeypress_NS6(evt)   
{   
 var eventTarget = evt ? evt.target : AppWindow.event.srcElement;  
 var funcname = "";  
 if(!eventTarget.name) 
    return; 
 funcname = 'onkeypress_'+ eventTarget.name + '(evt)' ;  
 if(eventTarget.type == 'textarea') {  
 var keyCode = evt.keyCode ; 
 specialKey=(keyCode>32&&keyCode<41)||keyCode==46||keyCode==8||keyCode==9 ;  
 if(!eval(funcname)&& (!specialKey)) 
     evt.preventDefault(); 
 } else {                           
 try{eval(funcname);}catch(e){;}  
 }                                
}                                
                                
function disable_image(){ 
 } 
 
function enterKey(evt)
 {
  var eventTarget = evt ? evt.target : AppWindow.event.srcElement;
  var keyCode = ie4 ? AppWindow.event.keyCode : evt.which ;
  var isLink = ( eventTarget.tagName == 'A');
  var isButton = ( eventTarget.tagName == 'BUTTON' ); 
 return !( keyCode == 13 &&
	((isButton || isLink )? findElement(eventTarget.name,0).disabled:eventTarget.type != 'textarea'));
 }
                        
var propertyFileName; 
if (MESSAGEFILE != 'wr') 
  propertyFileName = 'ief_Error_'+MESSAGEFILE+'.js'; 
else  
  propertyFileName = 'ief_Error.js'; 
                                 
var fileContext; 
if (typeof parent.context != 'undefined') 
  fileContext = parent.context; 
else if (typeof context != 'undefined') 
  fileContext = context; 
else  
  fileContext = ""; 
                                 
 document.write("<SCRIPT LANGUAGE=JavaScript SRC='"+fileContext+propertyFileName+"'><\/SCRIPT>"); 
 document.write("<SCRIPT LANGUAGE=JavaScript SRC='"+fileContext+"ief_Validation.js'><\/SCRIPT>"); 
   
 function Validate(control)                       
 {                                                
var PVAL_3600074_FLAG = new Array(	new WIPERMIT('N', ''),	new WIPERMIT('Y', ''));
var PVAL_360009F_DROP_LIST1 = new Array(	new WIPERMIT('+', ''),	new WIPERMIT('-', ''),	new WIPERMIT('E', ''),	new WIPERMIT('D', ''));
 var Number1DM = new WIDOMAIN('8','L','8','0','','0','0','0',' ');
 var Number2DM = new WIDOMAIN('5','L','5','0','','0','0','0',' ');
   var name = control.name; 
   var ret = false; 
   var DM = eval(name+"DM"); 
   if (typeof DM != "undefined") 
      { 
         if (DM.permit != '0') 
            {                  
            var PV = eval(DM.permit); 
            if (typeof PV != "undefined") 
                  ret=validate_EP(name,control.value, DM, PV);   
            else                               
                  ret=validate_EP(name,control.value, DM, null); 
            }                                    
         else                                    
            ret=validate_EP(name,control.value, DM, null); 
         if ((ret == true) && ((errMsg==null) || (errMsg.length==0)))            
           control.value = screenOut; 
      } // DM                                 
    if(ret==false)                            
    {                                         
     alert(errMsg);                           
     setTimeout("doSelect('"+control.name+"')", 0); 
    }                                         
    return(ret);                              
 }    
 var defaultFBColor = new Array(new DEFAULTCOLOR('Number1','000000','ffffff'),new DEFAULTCOLOR('Number2','000000','ffffff'),new DEFAULTCOLOR('Field1','000000','ffffff'));
//-- enable/disable state tables  -- 

 function initPage() 
 {
  if(!ie4) 
   AppWindow.document.addEventListener("keypress", onkeypress_NS6, true); 
  findElement('Number1',0).onblur = onblur_Number1; 
  findElement('Number1',0).onfocus = onfocus_Number1; 
  findElement('plus',0).onclick = function() { AnyEvent('RC109','on','Click') }; 
  findElement('mins',0).onclick = function() { AnyEvent('RC110','on','Click') }; 
  findElement('Number2',0).onblur = onblur_Number2; 
  findElement('Number2',0).onfocus = onfocus_Number2; 
  findElement('multiply',0).onclick = function() { AnyEvent('RC113','on','Click') }; 
  findElement('Amaty',0).onclick = function() { AnyEvent('RC116','on','Click') }; 
  findElement('Button1',0).onclick = function() { AnyEvent('RC117','on','Click') }; 
  if (findElement('CALCULAT_WINCLOSE',0) != null) 
    findElement('CALCULAT_WINCLOSE',0).onclick = function() { AnyEvent('RC104','on','Close') }; 
  AppWindow.document.onkeydown = enterKey; 
 }

 function initPageFocus() 
 {
  updateFocus('Number1'); 
 }

 function onblur_Number1() 
 {
  disabledbyChecked = false;
  if (lastFocus == 'Number1') lastFocus = null; 
  if (!Validate(this)) return false;
 }
 
 function onfocus_Number1() 
 {
  lastFocus = 'Number1';
 }
 function onblur_Number2() 
 {
  disabledbyChecked = false;
  if (lastFocus == 'Number2') lastFocus = null; 
  if (!Validate(this)) return false;
 }
 
 function onfocus_Number2() 
 {
  lastFocus = 'Number2';
 }
 function DoAnyEvent(rcid, v1, eventtype) {	clearClickId();
	if (eventtype !='WinResize' && eventtype != 'WinMove' && isFieldinError())
		return false;  
	processEvent(rcid, v1, eventtype, "CALCULAT_WIN"); 
 }
  
 function getFormData(rcid, v1, eventtype)
 {
	var formData = "";
	var delimiter='~';

		if (eventtype !='WinResize' && eventtype != 'WinMove' && isFieldinError()) 
	return false;
		formData = rcid+' '+v1+' '+eventtype+delimiter 
			+'RC107'+' '+findElement('Number1',0).value+delimiter 
			+'RC111'+' '+findElement('Number2',0).value+delimiter 
	return formData
 }
