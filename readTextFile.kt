private fun readTextFile(fullPath: String) :String {
        val file = File(fullPath)
        if(!file.exists()) return "" //if no exists file

        val reader = FileReader(file)
        val buffer = BufferedReader(reader)

        var temp:String? = ""
        var result = StringBuffer()

        while(true){
            temp = buffer.readLine() // line read
            if(temp == null) break
            else result.append(temp).append("\n")
        }
        buffer.close()
        return result.toString()
    }
