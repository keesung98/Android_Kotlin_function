private fun createnovelpage(file: File){
        val param: LinearLayout.LayoutParams=
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)    // param = LinearLayout.LayoutParams
        val TextButton: Button= Button(applicationContext)  // param = Button(applicationContext)
        TextButton.id=0
        TextButton.text=file.name
        TextButton.textSize=15f
        param.gravity=Gravity.CENTER
        TextButton.layoutParams=param
        TextButton.setOnClickListener{
            val intent = Intent(this,Activity::class.java)
            startActivity(intent)
        }
        verticalLayout.addView(TextButton)              //addView(TextButton)
    }
