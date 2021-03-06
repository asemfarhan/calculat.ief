                                                              
/****************************************************************
 *
 *                    Source Code Generated by
 *                           CA Gen 8.6
 *
 *    Copyright (c) 2016 CA Technologies. All rights reserved.
 *
 *    Name: AMATY                            Date: 2016/11/25
 *    Target OS:   WINDOWS                   Time: 03:33:54
 *    Target DBMS: <NONE>                    User: mansour
 *    Access Method: Embedded SQL   
 *
 *    Generation options:
 *    Debug trace option selected
 *    Data modeling constraint enforcement not selected
 *    Optimized import view initialization not selected
 *    High performance view passing ignored for pstep
 *    Last_statement_num execution selected
 *    Enforce default values with DBMS not selected
 *    Init unspecified optional fields to NULL not selected
 *
 ***************************************************************/
/****************************************************************
 Data declarations
 ***************************************************************/
static char ief_cgen_rlse[] = "CA Gen 8.6";
static char * ss_copyright = "Copyright (c) 2016 CA Technologies. All rights reserved.";
static char ief_cgen_date[] = "2016/11/25";
static char ief_cgen_time[] = "03:33:54";
static char ief_cgen_ency[] = "9.2.A6";
static char ief_cgen_userid[] = "mansour";
static char ief_cgen_model[] = "CALCULAT";
static char ief_cgen_subset[] = "ALL";
static char ief_cgen_name[] = "AMATY";
#define TGT_INTERNAL
#define TGT_ANSI
#define TGT_WIN
#define TGT_WIN32
#define TGT_NODASG

#include <tiabinc.h>

/* * * * * * * * * * * * * * * * * * * * */
/* START OF IMPORT VIEWS */
/* * * * * * * * * * * * * * * * * * * * */
/* Data View Group: W_IA */
/*       DVG id name: A_0105906281_IA */
struct a_0105906281_ia
{
/* Entity View: IN_RESULT */
/*        Type: IEF_SUPPLIED */
char result_001as;
double result_001;
/* Entity View: IN_REAL */
/*        Type: IEF_SUPPLIED */
char total_real_002as;
double total_real_002;
};

static struct a_0105906281_ia  *w_ia;

/* * * * * * * * * * * * * * * * * * * * */
/* START OF EXPORT VIEWS */
/* * * * * * * * * * * * * * * * * * * * */
/* Data View Group: W_OA */
/*       DVG id name: A_0106954858_OA */
struct a_0106954858_oa
{
/* Entity View: OUT_RESULT */
/*        Type: IEF_SUPPLIED */
char result_003as;
char result_003at[6];
double result_003;
/* Entity View: OUT_REAL */
/*        Type: IEF_SUPPLIED */
char total_real_004as;
char total_real_004at[6];
double total_real_004;
/* Entity View: OUT */
/*        Type: CALCULAT_NAME */
char all_number_005as;
char all_number_005at[6];
char all_number_005[201] /* 200 + 1 */;
};

static struct a_0106954858_oa  *w_oa;

/* * * * * * * * * * * * * * * * * * * * */
/* START OF LOCAL VIEWS */
/* * * * * * * * * * * * * * * * * * * * */
/* Data View Group: W_LA */
/*       DVG id name: A_0108003432_LA */
struct a_0108003432_la
{
struct
{
/* Entity View: LOCAL */
/*        Type: CALCULAT_NAME */
char all_number_006as;
char all_number_006[201] /* 200 + 1 */;
} l000l01;
struct
{
/* Entity View: LOCAL_RESULT */
/*        Type: IEF_SUPPLIED */
char result_007as;
double result_007;
} l001l01;
};

static struct a_0108003432_la w_la_alloc;

static struct a_0108003432_la  *w_la;

/* * * * * * * * * * * * * * * * * * * * */
/* START OF EXIT STATES */
/* * * * * * * * * * * * * * * * * * * * */
static long ex_return_back_to_main001 = 238026768;
static char long64bit_len[5];
/* * * * * * * * * * * * * * * * * * */
/* MISC DECLARATIONS AND PROTOTYPES  */
/*    FOLLOW AS NEEDED:              */
/* * * * * * * * * * * * * * * * * * */

static char func_0022020096_esc_flag;
static void f_22020096(void);
void p1_amaty_pb_plus_click01();
static char func_0417333253_esc_flag;
void p1_amaty_pb_clear_click02();
static char func_0417333254_esc_flag;
void p1_amaty_pb_back_click03();
static char func_0417333255_esc_flag;
static void f_22020096_localAlloc();
static void f_22020096_init();
static void f_0_trace(void);
static struct
{
char Name[32];
char  *DataPtr;
long Len;
long Prec;
long Card;
short Level;
char Viewtype;
char Domain;
char  *AuxPtr;
} padview[] = {
{

"IMPORT                          ",
(char *)0L,
0L,
0L,
0L,
1,
'B',
' ',
(char *)0L,
}
,
{

"IN_RESULT                       ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"IEF_SUPPLIED                    ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"RESULT                          ",
(char *)0L,
0L,
2L,
0L,
3,
'P',
'N',
(char *)0L,
}
,
{

"IN_REAL                         ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"IEF_SUPPLIED                    ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"TOTAL_REAL                      ",
(char *)0L,
0L,
4L,
0L,
3,
'P',
'N',
(char *)0L,
}
,
{

"EXPORT                          ",
(char *)0L,
0L,
0L,
0L,
1,
'B',
' ',
(char *)0L,
}
,
{

"OUT_RESULT                      ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"IEF_SUPPLIED                    ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"RESULT                          ",
(char *)0L,
0L,
2L,
0L,
3,
'P',
'N',
(char *)0L,
}
,
{

"OUT_REAL                        ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"IEF_SUPPLIED                    ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"TOTAL_REAL                      ",
(char *)0L,
0L,
4L,
0L,
3,
'P',
'N',
(char *)0L,
}
,
{

"OUT                             ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"CALCULAT_NAME                   ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"ALL_NUMBER                      ",
(char *)0L,
0L,
0L,
0L,
3,
'P',
'T',
(char *)0L,
}
,
{

"LOCAL                           ",
(char *)0L,
0L,
0L,
0L,
1,
'B',
' ',
(char *)0L,
}
,
{

"LOCAL                           ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"CALCULAT_NAME                   ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"ALL_NUMBER                      ",
(char *)0L,
0L,
0L,
0L,
3,
'P',
'T',
(char *)0L,
}
,
{

"LOCAL_RESULT                    ",
(char *)0L,
0L,
0L,
0L,
2,
'V',
' ',
(char *)0L,
}
,
{

"IEF_SUPPLIED                    ",
(char *)0L,
0L,
0L,
0L,
3,
'E',
' ',
(char *)0L,
}
,
{

"RESULT                          ",
(char *)0L,
0L,
2L,
0L,
3,
'P',
'N',
(char *)0L,
}
,
{

"******** BOTTOM OF DATA ********",
(char *)0L,
0L,
0L,
0L,
0,
'Z',
' ',
(char *)0L,
}
,
}
;

static void padview_init(void);

static short trace_ret_code;
static struct
{
long padn;
long padsubn;
char  *pads;
} padtext[] = {
{

   0L,   0L,"+->   AMATY                             11/25/2016  03:33"
}
,
{

   0L,   0L,"!       IMPORTS:"
}
,
{

   0L,   0L,"!         Work View in_result ief_supplied (Transient, Optional, Import only)"
}
,
{

   0L,   0L,"!           result"
}
,
{

   0L,   0L,"!         Work View in_real ief_supplied (Transient, Optional, Import only)"
}
,
{

   0L,   0L,"!           total_real"
}
,
{

   0L,   0L,"!       EXPORTS:"
}
,
{

   0L,   0L,"!         Work View out_result ief_supplied (Transient, Export only)"
}
,
{

   0L,   0L,"!           result"
}
,
{

   0L,   0L,"!         Work View out_real ief_supplied (Transient, Export only)"
}
,
{

   0L,   0L,"!           total_real"
}
,
{

   0L,   0L,"!         Work View out calculat_name (Transient, Export only)"
}
,
{

   0L,   0L,"!           all_number"
}
,
{

   0L,   0L,"!       LOCALS:"
}
,
{

   0L,   0L,"!         Work View local calculat_name"
}
,
{

   0L,   0L,"!           all_number"
}
,
{

   0L,   0L,"!         Work View local_result ief_supplied"
}
,
{

   0L,   0L,"!           result"
}
,
{

   0L,   0L,"!"
}
,
{

   0L,   0L,"!     PROCEDURE STATEMENTS"
}
,
{

   0L,   0L,"!"
}
,
{

   0L,   0L,"+---"
}
,
{

   0L,   0L," "
}
,
{

   0L,   0L,"+->   EVENT:  AMATY_PB_PLUS_CLICK             "
}
,
{

   1L,   0L,"!  SET out_result ief_supplied result TO out_real ief_supplied total_real + local_result ief_supplied result "
}
,
{

   2L,   0L,"!  SET local_result ief_supplied result TO out_result ief_supplied result "
}
,
{

   0L,   0L,"+---"
}
,
{

   0L,   0L," "
}
,
{

   0L,   0L,"+->   EVENT:  AMATY_PB_CLEAR_CLICK            "
}
,
{

   3L,   0L,"!  SET out calculat_name all_number TO SPACES "
}
,
{

   4L,   0L,"!  SET out_real ief_supplied total_real TO 0 "
}
,
{

   5L,   0L,"!  SET out_result ief_supplied result TO 0 "
}
,
{

   0L,   0L,"+---"
}
,
{

   0L,   0L," "
}
,
{

   0L,   0L,"+->   EVENT:  AMATY_PB_BACK_CLICK             "
}
,
{

   6L,   0L,"!  EXIT STATE IS return_back_to_main"
}
,
{

   0L,   0L,"+---"
}
,
{

  -1L,   0L,"************************* BOTTOM OF DATA *************************"
}
,
}
;
/*       +->   AMATY                             11/25/2016  03:33                                                            */
/*       !       IMPORTS:                                                                                                     */
/*       !         Work View in_result ief_supplied (Transient, Optional, Import only)                                        */
/*       !           result                                                                                                   */
/*       !         Work View in_real ief_supplied (Transient, Optional, Import only)                                          */
/*       !           total_real                                                                                               */
/*       !       EXPORTS:                                                                                                     */
/*       !         Work View out_result ief_supplied (Transient, Export only)                                                 */
/*       !           result                                                                                                   */
/*       !         Work View out_real ief_supplied (Transient, Export only)                                                   */
/*       !           total_real                                                                                               */
/*       !         Work View out calculat_name (Transient, Export only)                                                       */
/*       !           all_number                                                                                               */
/*       !       LOCALS:                                                                                                      */
/*       !         Work View local calculat_name                                                                              */
/*       !           all_number                                                                                               */
/*       !         Work View local_result ief_supplied                                                                        */
/*       !           result                                                                                                   */
/*       !                                                                                                                    */
/*       !     PROCEDURE STATEMENTS                                                                                           */
/*       !                                                                                                                    */
/*       +---                                                                                                                 */
/*                                                                                                                            */
/*       +->   EVENT:  AMATY_PB_PLUS_CLICK                                                                                    */
/*     1 !  SET out_result ief_supplied result TO out_real ief_supplied total_real + local_result ief_supplied result         */
/*     2 !  SET local_result ief_supplied result TO out_result ief_supplied result                                            */
/*       +---                                                                                                                 */
/*                                                                                                                            */
/*       +->   EVENT:  AMATY_PB_CLEAR_CLICK                                                                                   */
/*     3 !  SET out calculat_name all_number TO SPACES                                                                        */
/*     4 !  SET out_real ief_supplied total_real TO 0                                                                         */
/*     5 !  SET out_result ief_supplied result TO 0                                                                           */
/*       +---                                                                                                                 */
/*                                                                                                                            */
/*       +->   EVENT:  AMATY_PB_BACK_CLICK                                                                                    */
/*     6 !  EXIT STATE IS return_back_to_main                                                                                 */
/*       +---                                                                                                                 */



/* * * * * * * * * * * * * * * * * * * */
/* ACTION BLOCK FUNCTION DECLARATIONS  */
/* * * * * * * * * * * * * * * * * * * */

void P1(in_runtime_parm1,
in_runtime_parm2,
in_globdata,
import_view,
export_view)
char  *in_runtime_parm1;
char  *in_runtime_parm2;
struct ief_globdata  *in_globdata;
struct a_0105906281_ia  *import_view;
struct a_0106954858_oa  *export_view;
{
ief_runtime_parm1 = in_runtime_parm1;
ief_runtime_parm2 = in_runtime_parm2;
globdata = in_globdata;
w_ia = import_view;
w_oa = export_view;

f_22020096_localAlloc("AMATY");
 if (globdata->psmgr_error_data.error_encountered_sw == LOCAL_VIEW_ALLOC_ERROR)
return;

++(NestingLevel);
 if (setjmp(excp_jumpbuf))
{
}
 else {
f_22020096_init(1);
f_22020096();

}
NestingLevel--;
strcpy(last_stmt_num_saved, globdata->psmgr_debug_data.last_statement_num);
globdata->psmgr_debug_data.last_statement_num = "9999999999";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = last_stmt_num_saved;
return;
}


static void f_22020096(void)
{
func_0022020096_esc_flag = '\0';
strcpy(globdata->psmgr_debug_data.cur_ab_id, "0022020096");
strcpy(globdata->psmgr_debug_data.cur_ab_name, "AMATY");
padview_init();
globdata->psmgr_debug_data.last_statement_num = "0000000000";
f_0_trace();
}


/* * * * * * * * * * * * * * * * * * * */
/* EVENT HANDLER FUNCTION DECLARATIONS  */
/* * * * * * * * * * * * * * * * * * * */

void p1_amaty_pb_plus_click01(in_runtime_parm1,
in_runtime_parm2,
in_globdata,
import_view,
export_view)
char  *in_runtime_parm1;
char  *in_runtime_parm2;
struct ief_globdata  *in_globdata;
struct a_0105906281_ia  *import_view;
struct a_0106954858_oa  *export_view;
{
ief_runtime_parm1 = in_runtime_parm1;
ief_runtime_parm2 = in_runtime_parm2;
globdata = in_globdata;
w_ia = import_view;
w_oa = export_view;

f_22020096_localAlloc("AMATY_PB_PLUS_CLICK");
 if (globdata->psmgr_error_data.error_encountered_sw == LOCAL_VIEW_ALLOC_ERROR)
return;

 if (setjmp(excp_jumpbuf))
{
}
 else {
f_22020096_init(0);
func_0022020096_esc_flag = '\0';
func_0417333253_esc_flag = '\0';
strcpy(globdata->psmgr_debug_data.cur_ab_id, "0022020096");
strcpy(globdata->psmgr_debug_data.cur_ab_name, "AMATY_PB_PLUS_CLICK");
strcpy(globdata->tracedata.curr_event_type, "Click");
padview_init();
globdata->psmgr_debug_data.last_statement_num = "0000000000";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = "0000000001";
f_0_trace();
 if (trace_ret_code != 8)
{
w_oa->result_003 = tird2dc1((double)
(w_oa->total_real_004  +  w_la->l001l01.result_007), 2, 0, 15);
}
globdata->psmgr_debug_data.last_statement_num = "0000000002";
f_0_trace();
 if (trace_ret_code != 8)
{
w_la->l001l01.result_007 = tird2dc1((double)w_oa->result_003, 2, 0, 15);
}
}

strcpy(last_stmt_num_saved, globdata->psmgr_debug_data.last_statement_num);
globdata->psmgr_debug_data.last_statement_num = "9999999999";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = last_stmt_num_saved;
return;
}

void p1_amaty_pb_clear_click02(in_runtime_parm1,
in_runtime_parm2,
in_globdata,
import_view,
export_view)
char  *in_runtime_parm1;
char  *in_runtime_parm2;
struct ief_globdata  *in_globdata;
struct a_0105906281_ia  *import_view;
struct a_0106954858_oa  *export_view;
{
ief_runtime_parm1 = in_runtime_parm1;
ief_runtime_parm2 = in_runtime_parm2;
globdata = in_globdata;
w_ia = import_view;
w_oa = export_view;

f_22020096_localAlloc("AMATY_PB_CLEAR_CLICK");
 if (globdata->psmgr_error_data.error_encountered_sw == LOCAL_VIEW_ALLOC_ERROR)
return;

 if (setjmp(excp_jumpbuf))
{
}
 else {
f_22020096_init(0);
func_0022020096_esc_flag = '\0';
func_0417333254_esc_flag = '\0';
strcpy(globdata->psmgr_debug_data.cur_ab_id, "0022020096");
strcpy(globdata->psmgr_debug_data.cur_ab_name, "AMATY_PB_CLEAR_CLICK");
strcpy(globdata->tracedata.curr_event_type, "Click");
padview_init();
globdata->psmgr_debug_data.last_statement_num = "0000000000";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = "0000000003";
f_0_trace();
 if (trace_ret_code != 8)
{
Tistrcpy(w_oa->all_number_005, SPACES, sizeof(w_oa->all_number_005));
}
globdata->psmgr_debug_data.last_statement_num = "0000000004";
f_0_trace();
 if (trace_ret_code != 8)
{
w_oa->total_real_004 = tird2dc1((double)0., 4, 0, 15);
}
globdata->psmgr_debug_data.last_statement_num = "0000000005";
f_0_trace();
 if (trace_ret_code != 8)
{
w_oa->result_003 = tird2dc1((double)0., 2, 0, 15);
}
}

strcpy(last_stmt_num_saved, globdata->psmgr_debug_data.last_statement_num);
globdata->psmgr_debug_data.last_statement_num = "9999999999";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = last_stmt_num_saved;
return;
}

void p1_amaty_pb_back_click03(in_runtime_parm1,
in_runtime_parm2,
in_globdata,
import_view,
export_view)
char  *in_runtime_parm1;
char  *in_runtime_parm2;
struct ief_globdata  *in_globdata;
struct a_0105906281_ia  *import_view;
struct a_0106954858_oa  *export_view;
{
ief_runtime_parm1 = in_runtime_parm1;
ief_runtime_parm2 = in_runtime_parm2;
globdata = in_globdata;
w_ia = import_view;
w_oa = export_view;

f_22020096_localAlloc("AMATY_PB_BACK_CLICK");
 if (globdata->psmgr_error_data.error_encountered_sw == LOCAL_VIEW_ALLOC_ERROR)
return;

 if (setjmp(excp_jumpbuf))
{
}
 else {
f_22020096_init(0);
func_0022020096_esc_flag = '\0';
func_0417333255_esc_flag = '\0';
strcpy(globdata->psmgr_debug_data.cur_ab_id, "0022020096");
strcpy(globdata->psmgr_debug_data.cur_ab_name, "AMATY_PB_BACK_CLICK");
strcpy(globdata->tracedata.curr_event_type, "Click");
padview_init();
globdata->psmgr_debug_data.last_statement_num = "0000000000";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = "0000000006";
f_0_trace();
 if (trace_ret_code != 8)
{
globdata->psmgr_exit_state = ex_return_back_to_main001;
memset(globdata->psmgr_exit_infomsg, ' ', sizeof(globdata->psmgr_exit_infomsg));
globdata->psmgr_exit_infomsg[sizeof(globdata->psmgr_exit_infomsg) - 1] = '\0';
globdata->psmgr_rollback_rqsted = ' ';
globdata->psmgr_exit_msgtype = 'N';
}
}

strcpy(last_stmt_num_saved, globdata->psmgr_debug_data.last_statement_num);
globdata->psmgr_debug_data.last_statement_num = "9999999999";
f_0_trace();
globdata->psmgr_debug_data.last_statement_num = last_stmt_num_saved;
return;
}


/* * * * * * * * * * * * * * * * * * * */
/* SUBORDINATE FUNCTIONS */
/* * * * * * * * * * * * * * * * * * * */


/* * * * * * * * * * * * * * * * * * */
/* INITIALIZATION UTILITY FUNCTIONS  */
/* * * * * * * * * * * * * * * * * * */



static void f_22020096_localAlloc(abname)
char  *abname;
{
w_la = &w_la_alloc;
}

static void f_22020096_init(doall)
int doall;
{

pda_queue_cmcb = &da_queue_cmcb;
pda_queue_cmcb->dqe.da_queue_entid = 0;

pda_queue_cmcb->dqr.da_queue_relmmid = 0;

memcpy(pda_queue_cmcb->da_queue_max,
    "0500",
    sizeof(pda_queue_cmcb->da_queue_max));

pda_queue_cmcb->pointer_flag = 'U';
 if (NestingLevel < 2)
{

memset(w_la, '\0', sizeof(struct a_0108003432_la));
}
 if (doall)
{
memset(&w_oa->result_003, '\0', sizeof(w_oa->result_003));
memset(&w_oa->total_real_004, '\0', sizeof(w_oa->total_real_004));
memset(w_oa->all_number_005, '\0', sizeof(w_oa->all_number_005));
}
 if (doall)
{
}
}
static void f_0_trace(void)
{
trace_ret_code = TIRTRACE(ief_runtime_parm1,
    ief_runtime_parm2,
    globdata,
    padtext,
    padview);
 if (trace_ret_code == 20)
{
longjmp(excp_jumpbuf, TRACE_EXCEPTION);
}
return;
}
static void padview_init(void)
{
padview[0].DataPtr = (char *)(w_ia);
padview[0].Len = sizeof(*w_ia);
padview[3].DataPtr = (char *)(&w_ia->result_001);
padview[3].AuxPtr = (char *)(&w_ia->result_001as);
padview[3].Len = 15;
padview[6].DataPtr = (char *)(&w_ia->total_real_002);
padview[6].AuxPtr = (char *)(&w_ia->total_real_002as);
padview[6].Len = 15;
padview[7].DataPtr = (char *)(w_oa);
padview[7].Len = sizeof(*w_oa);
padview[10].DataPtr = (char *)(&w_oa->result_003);
padview[10].AuxPtr = (char *)(&w_oa->result_003as);
padview[10].Len = 15;
padview[13].DataPtr = (char *)(&w_oa->total_real_004);
padview[13].AuxPtr = (char *)(&w_oa->total_real_004as);
padview[13].Len = 15;
padview[16].DataPtr = (char *)(w_oa->all_number_005);
padview[16].AuxPtr = (char *)(&w_oa->all_number_005as);
padview[16].Len = 200;
padview[17].DataPtr = (char *)(w_la);
padview[17].Len = sizeof(*w_la);
padview[20].DataPtr = (char *)(w_la->l000l01.all_number_006);
padview[20].AuxPtr = (char *)(&w_la->l000l01.all_number_006as);
padview[20].Len = 200;
padview[23].DataPtr = (char *)(&w_la->l001l01.result_007);
padview[23].AuxPtr = (char *)(&w_la->l001l01.result_007as);
padview[23].Len = 15;
}
