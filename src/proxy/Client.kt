package proxy

class Client {
    private val initDrawNum = 3

    init {
        val imageList = getProxyImageList()
        for (i in 0 until initDrawNum) {
            imageList[i].draw()
        }
    }

    private fun getProxyImageList(): ArrayList<Subject> {
        val proxyImageList = ArrayList<Subject>()
        proxyImageList.add(ImageProxy("./image/りんご.png"))
        proxyImageList.add(ImageProxy("./image/みかん.png"))
        proxyImageList.add(ImageProxy("./image/もも.png"))
        proxyImageList.add(ImageProxy("./image/ばなな.png"))
        proxyImageList.add(ImageProxy("./image/ぱいなっぷる.png"))
        proxyImageList.add(ImageProxy("./image/いちご.png"))

        return proxyImageList
    }

    private fun getNonProxyImageList(): ArrayList<Subject> {
        val imageList = ArrayList<Subject>()
        imageList.add(Image("./image/りんご.png"))
        imageList.add(Image("./image/みかん.png"))
        imageList.add(Image("./image/もも.png"))
        imageList.add(Image("./image/ばなな.png"))
        imageList.add(Image("./image/ぱいなっぷる.png"))
        imageList.add(Image("./image/いちご.png"))

        return imageList
    }
}