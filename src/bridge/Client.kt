package bridge

class Client {
    init {
        val colorIcon = AbstColorIcon()
        print(colorIcon.getType() + "\n")
        print(colorIcon.getBigIcon().getIcon() + "\n")
        print(colorIcon.getMiddleIcon().getIcon() + "\n")
        print(colorIcon.getSmallIcon().getIcon() + "\n")

        val blackAndWhiteIcon = AbstBlackAndWhiteIcon()
        print(blackAndWhiteIcon.getType() + "\n")
        print(blackAndWhiteIcon.getBigIcon().getIcon() + "\n")
        print(blackAndWhiteIcon.getMiddleIcon().getIcon() + "\n")
        print(blackAndWhiteIcon.getSmallIcon().getIcon() + "\n")

        val clearIcon = AbstClearIcon()
        print(clearIcon.getType() + "\n")
        print(clearIcon.getBigIcon().getIcon() + "\n")
        print(clearIcon.getMiddleIcon().getIcon() + "\n")
        print(clearIcon.getSmallIcon().getIcon() + "\n")
    }
}