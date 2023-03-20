//listclear
fun ListClear(){
    //리스트 뷰 내용물 제거
    verticalLayout.removeAllViews()
    //내용물 다시 생성
    verticalLayout=findViewById(R.id.scroll_vertical)
    val file=File("$dataDir/files/${name}/character")
    val files=file.listFiles()
    val i=files.size-1
    for(j in 0..i){
        createnovelpage(files.get(j))
    }
} 