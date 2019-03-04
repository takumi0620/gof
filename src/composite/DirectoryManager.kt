package composite

/**
 * Client 使用者
 */
class DirectoryManager {
    init {
        // ルートフォルダ
        val rootDirectory = Directory("/")
        rootDirectory.addElement(File("sample.config"))
        rootDirectory.addElement(File("gof.env"))

        // iOSアプリ用フォルダ
        val iosDirectory = Directory("iOS")

        val iosAppDirectory = Directory("GofiOSApp")
        iosAppDirectory.addElement(File("xcode.project"))

        val iosAppSourceDirectory = Directory("Source")
        iosAppSourceDirectory.addElement(File("hoge.swift"))
        iosAppSourceDirectory.addElement(File("fuga.swift"))

        iosDirectory.addElement(iosAppDirectory)
        iosAppDirectory.addElement(iosAppSourceDirectory)
        iosAppDirectory.addElement(iosAppSourceDirectory)
        rootDirectory.addElement(iosDirectory)

        // Androidアプリ用フォルダ
        val androidDirectory = Directory("AndroidOS")

        val androidAppDirectory = Directory("GofAndroidApp")
        androidAppDirectory.addElement(File("AndroidManifest.xml"))

        val androidAppSourceDirectory = Directory("Source")
        androidAppSourceDirectory.addElement(File("moge.kt"))
        androidAppSourceDirectory.addElement(File("unbaba.kt"))

        androidDirectory.addElement(androidAppDirectory)
        androidAppDirectory.addElement(androidAppSourceDirectory)
        rootDirectory.addElement(androidDirectory)

        show(rootDirectory, 0)
    }

    private fun show(element: Element, indent: Int) {

        if (element is Directory) {
            print("${"----".repeat(indent)}【${element.getType().type}】${element.getName()}\n")
            element.elementList.forEach {
                show(it, indent + 1)
            }
        } else {
            print("${"----".repeat(indent)}【${element.getType().type}】${element.getName()}\n")
        }
    }
}