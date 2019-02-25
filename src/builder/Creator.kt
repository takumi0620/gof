package builder

/**
 * 街を作る人
 * Director
 */
class Creator {
    init {
        var productList:MutableList<Product> = mutableListOf()

        // 西洋美術館の建築を美術館専門建築業者に依頼する
        var artMuseumBuilder1 = ArtMuseumBuilder("西洋美術館").apply {
            addFloor(1)
            addFloor(2)
            addFloor(3)
            addRoom(1, 101)
            addRoom(1, 102)
            addRoom(2, 201)
            addRoom(3, 301)
        }
        // 東洋美術館の建築を美術館専門建築業者に依頼する
        var artMuseumBuilder2 = ArtMuseumBuilder("東洋美術館").apply {
            addFloor(1)
            addFloor(2)
            addRoom(1, 101)
            addRoom(2, 201)
        }

        // 国立博物館の建築を博物館専門建築業者に依頼する
        var museumBuilder = MuseumBuilder("国立博物館").apply {
            addFloor(1)
            addRoom(1, 101)
        }
        // ホーゲーシネマズの建築を映画館専門建築業者に依頼する
        var movieTheaterBuilder = MovieTheaterBuilder("HOGEシネマズ").apply {
            addFloor(1)
            addRoom(1, 101)
        }

        // 街に建築するリスト作成
        productList.add(artMuseumBuilder1.getProduct())
        productList.add(artMuseumBuilder1.getProduct())
        productList.add(artMuseumBuilder1.getProduct())
        productList.add(artMuseumBuilder2.getProduct())
        productList.add(artMuseumBuilder2.getProduct())
        productList.add(museumBuilder.getProduct())
        productList.add(movieTheaterBuilder.getProduct())

        for (product in productList) {
            print(product.show())
            print("\n")
        }

    }
}