import ar.edu.unsam.algo2.Perro
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PerroTest : DescribeSpec ({
    describe(name = "Test de perro") {
        it(name = "Cuando ladra el perro se escucha") {
            val perro = Perro()
            perro.ladrar() shouldBe "Guau!"
        }
    }
})