private fun ShowDialog(fullPath: String){
        val mDialogView = LayoutInflater.from(this).inflate(R.layout.yourlayout, null)
        val mBuilder = AlertDialog.Builder(this)
            .setView(mDialogView)
            .setTitle("제목")
        val  mAlertDialog=mBuilder.show()

        val saveButton=mDialogView.findViewById<Button>(R.id.save)
        val novel_nameandchar=mDialogView.findViewById<EditText>(R.id.name)
        saveButton.setOnClickListener{
            val genreWriter = FileWriter(fullPath+"/"+novel_nameandchar.text.toString())
            val genrebufferWriter = BufferedWriter(genreWriter)
            genrebufferWriter.write("")
            genrebufferWriter.close()
            mAlertDialog.dismiss()
        }
    }