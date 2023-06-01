package kotlinsprint.lesson_19.task_2

enum class ProductCategories {
    CLOTH,
    OFFICE_SUPPLIES,
    DIFFERENT_GOODS,
}

fun getProductCategory(productCategory: ProductCategories): String {
    return when (productCategory) {
        ProductCategories.CLOTH -> "одежда"
        ProductCategories.OFFICE_SUPPLIES -> "канцелярские товары"
        ProductCategories.DIFFERENT_GOODS -> "разное"
    }

}

class Good(
    private val name: String,
    private val goodId: Int,
    private val productCategory: ProductCategories,
) {

    fun printGoodInfo() {
        println(
            "Наименование товара: $name, идентификатор товара: $goodId, " +
                    "категория товара: ${getProductCategory(productCategory)}."
        )
    }
}

fun main() {

    val good1 = Good("пиджак", 345, ProductCategories.CLOTH)
    val good2 = Good("ручка", 567, ProductCategories.OFFICE_SUPPLIES)
    val good3 = Good("чайник", 987, ProductCategories.DIFFERENT_GOODS)
    val good4 = Good("мяч", 234, ProductCategories.DIFFERENT_GOODS)

    val listOfGoods = listOf(good1, good2, good3, good4)

    listOfGoods.forEach {
        it.printGoodInfo()
        println()
    }

}