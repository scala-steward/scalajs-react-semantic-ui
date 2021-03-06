package react.semanticui.views.item

import japgolly.scalajs.react.test._
import japgolly.scalajs.react.vdom.html_<^._
import react.common.syntax.vdom._

class ItemExtraSuite extends munit.FunSuite {
  test("render") {
    val ie = ItemExtra("Abc")
    ReactTestUtils.withNewBodyElement { mountNode =>
      ie.renderIntoDOM(mountNode)
      assertEquals(mountNode.innerHTML, """<div class="extra">Abc</div>""")
    }
  }
}
