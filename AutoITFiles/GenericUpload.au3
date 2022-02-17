;This Pop Up (Window) Id same For All Browser i.e we Write it inside Local Varible.
;Local $winId=WinWait("[CLASS:#32770]","",10)
;Set Focus to edit field
ControlFocus("[CLASS:#32770]","","Edit1")
Sleep(2000)
ControlSetText("[CLASS:#32770]","","Edit1","D:\Acceleration\Workspace\Oct_Maven_Project\AutoITFiles\TestUpload.txt")
Sleep(1000)
ControlClick("[CLASS:#32770]","","Button1")