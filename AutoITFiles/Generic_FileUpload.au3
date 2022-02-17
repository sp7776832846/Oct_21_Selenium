;This Pop Up (Window) Id same For All Browser i.e we Write it inside Local Varible.
Local $winId=WinWait("[CLASS:#32770]","",10)
;Set Focus to edit field
ControlFocus($winId,"","Edit1")
ControlSetText($winId,"","Edit1","D:\Acceleration\Workspace\Oct_Maven_Project\AutoITFiles\"&$CmdLine[1])
ControlClick($winId,"","Button1")