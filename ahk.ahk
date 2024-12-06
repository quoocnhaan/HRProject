; Đường dẫn tới file data.txt trên Desktop
filePath := "C:\Users\PC\Desktop\data.txt"

; Biến toàn cục để lưu trữ dữ liệu nhập vào (chỉ chứa số)
inputData := ""

; Hàm ghi vào file kèm ngày giờ
writeToFile() {
    global inputData, filePath
    ; Lấy ngày giờ hiện tại
    timeStamp := A_Now
    FormatTime, timeStamp, %timeStamp%, yyyy-MM-dd HH:mm:ss

    ; Ghi nội dung vào file kèm ngày giờ
    FileAppend, %inputData% - %timeStamp%`n, %filePath%

    ; Sau khi ghi xong, xóa dữ liệu để chuẩn bị cho lần nhập tiếp theo
    inputData := ""
}

; Lắng nghe các phím số
~1::appendToInputData("1")
~2::appendToInputData("2")
~3::appendToInputData("3")
~4::appendToInputData("4")
~5::appendToInputData("5")
~6::appendToInputData("6")
~7::appendToInputData("7")
~8::appendToInputData("8")
~9::appendToInputData("9")
~0::appendToInputData("0")

; Hàm để thêm các phím số vào inputData
appendToInputData(number) {
    global inputData
    inputData .= number
    return
}

; Gán phím Enter để ghi vào file
Enter::
    writeToFile()
    return