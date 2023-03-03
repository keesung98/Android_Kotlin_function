fun makeDirectory(Name:String){
        val path = File("$filesDir/${Name}")    //creating directory
        if(!path.exists()){
            path.mkdirs()                      // create directory
        }
        val genreWriter = FileWriter("$filesDir/${Name}/name.txt")  // create
        val genrebufferWriter = BufferedWriter(genreWriter)         // create
        genrebufferWriter.write(genre)                              // write
        genrebufferWriter.close()                                   // close
    }