//-- CA Gen 8.6 - File Name: AMATY.js - generated on 2017/04/09 (98) at 22:59:12   -- 
   
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
  if (keyCode == 13) {
   if ((isButton || isLink)&& findElement(eventTarget.name,0).disabled)
    return false;
   else if (eventTarget.name == 'plus' || (!isButton && !isLink && eventTarget.type != 'textarea'))
    return defaultPB();
  else
   return true;
 } 
}
 function defaultPB() 
 { 
   var obj1 = findElement('plus',0); 
   if (obj1.disabled)  
      return true;     
   else  {             
      obj1.focus();    
      AnyEvent('RC146','on','Click');
      return false;    
   } 
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
 var Field2DM = new WIDOMAIN('8','B','17','0','ZZZZZZZZ','0','0','0',' ');
 var demo_textDM = new WIDOMAIN('100','S','100','0','','0','0','1',' ');
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
 var defaultFBColor = new Array(new DEFAULTCOLOR('Field1','000000','ffffff'),new DEFAULTCOLOR('Field3','000000','ffffff'),new DEFAULTCOLOR('Field2','000000','ffffff'),new DEFAULTCOLOR('DropDownList1','000000','ffffff'),new DEFAULTCOLOR('demo_text','000000','ffffff'));
//-- enable/disable state tables  -- 

 function initPage() 
 {
  if(!ie4) 
   AppWindow.document.addEventListener("keypress", onkeypress_NS6, true); 
  findElement('Field2',0).onblur = onblur_Field2; 
  findElement('Field2',0).onfocus = onfocus_Field2; 
  findElement('Button3',0).onclick = function() { AnyEvent('RC133','on','Click') }; 
  findElement('Button4',0).onclick = function() { AnyEvent('RC134','on','Click') }; 
  findElement('Button5',0).onclick = function() { AnyEvent('RC135','on','Click') }; 
   findElement('DropDownList1',0).onchange = onchange_DropDownList1; 
  findElement('DropDownList1',0).onclick = onclick_DropDownList1; 
  findElement('Button14',0).onclick = function() { AnyEvent('RC138','on','Click') }; 
  findElement('Button6',0).onclick = function() { AnyEvent('RC139','on','Click') }; 
  findElement('Button7',0).onclick = function() { AnyEvent('RC140','on','Click') }; 
  findElement('Button8',0).onclick = function() { AnyEvent('RC141','on','Click') }; 
  findElement('Button9',0).onclick = function() { AnyEvent('RC142','on','Click') }; 
  findElement('Button10',0).onclick = function() { AnyEvent('RC143','on','Click') }; 
  findElement('Button11',0).onclick = function() { AnyEvent('RC144','on','Click') }; 
  findElement('Button12',0).onclick = function() { AnyEvent('RC145','on','Click') }; 
  findElement('plus',0).onclick = function() { AnyEvent('RC146','on','Click') }; 
  findElement('Button13',0).onclick = function() { AnyEvent('RC147','on','Click') }; 
  findElement('backamaty',0).onclick = function() { AnyEvent('RC148','on','Click') }; 
  findElement('clear_amaty',0).onclick = function() { AnyEvent('RC149','on','Click') }; 
  findElement('demo_text',0).onblur = onblur_demo_text; 
  findElement('demo_text',0).onfocus = onfocus_demo_text; 
  if (findElement('AMATYCLOSE',0) != null) 
    findElement('AMATYCLOSE',0).onclick = function() { AnyEvent('RC121','on','Close') }; 
  AppWindow.document.onkeydown = enterKey; 
 }

 function initPageFocus() 
 {
  updateFocus('Field2'); 
 }

 function onblur_Field2() 
 {
  disabledbyChecked = false;
  if (lastFocus == 'Field2') lastFocus = null; 
  if (!Validate(this)) return false;
 }
 
 function onfocus_Field2() 
 {
  lastFocus = 'Field2';
 }
 function onchange_DropDownList1() 
 {
  AnyEvent('RC136','on','Changed');
 }
 function onclick_DropDownList1() 
 {
  if (isFieldinError()) return false; 
 }
 function onblur_demo_text() 
 {
  disabledbyChecked = false;
  if (lastFocus == 'demo_text') lastFocus = null; 
  if (!Validate(this)) return false;
 }
 
 function onfocus_demo_text() 
 {
  lastFocus = 'demo_text';
 }
 function DoAnyEvent(rcid, v1, eventtype) {	clearClickId();
	if (eventtype !='WinResize' && eventtype != 'WinMove' && isFieldinError())
		return false;  
	processEvent(rcid, v1, eventtype, "AMATY"); 
 }
  
 function getFormData(rcid, v1, eventtype)
 {
	var formData = "";
	var delimiter='~';

		if (eventtype !='WinResize' && eventtype != 'WinMove' && isFieldinError()) 
	return false;
		formData = rcid+' '+v1+' '+eventtype+delimiter 
			+'RC131'+' '+findElement('Field2',0).value+delimiter 
			+'RC136'+' '+findElement('DropDownList1',0).selectedIndex+delimiter 
			+'RC150'+' '+findElement('demo_text',0).value+delimiter 
	return formData
 }
