private fun readTextFile(fullPath: String) :String {
        val file = File(fullPath)
        if(!file.exists()) return "" //파일이 존재하지 않을때

        val reader = FileReader(file)
        val buffer = BufferedReader(reader)

        var temp:String? = ""
        var result = StringBuffer()

        while(true){
            temp = buffer.readLine() // 줄단위로 read
            if(temp == null) break
            else result.append(temp).append("\n")
        }
        buffer.close()
        return result.toString()
    }