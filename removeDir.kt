fun removeDir(mRootPath: String?) {
        val file = File(mRootPath)
        val childFileList = file.listFiles()
        for (childFile in childFileList) {
            if (childFile.isDirectory) {
                removeDir(childFile.absolutePath) //childFile.delete()
            } else {
                childFile.delete() //childFile.delete()
            }
        }
        file.delete() //root delete()
    }