package react.semanticui.collections.message

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

final case class MessageItem(
  as:                    js.UndefOr[AsC]                                     = js.undefined,
  child:                 js.UndefOr[VdomNode]                                = js.undefined,
  className:             js.UndefOr[String]                                  = js.undefined,
  clazz:                 js.UndefOr[Css]                                     = js.undefined,
  content:               js.UndefOr[VdomNode | MessageItem.MessageItemProps] = js.undefined,
  override val children: CtorType.ChildrenArgs                               = Seq.empty
) extends GenericComponentPC[MessageItem.MessageItemProps] {
  override def cprops = MessageItem.props(this)
  @inline def renderWith =
    MessageItem.component(MessageItem.props(this))
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
}

object MessageItem {
  @js.native
  @JSImport("semantic-ui-react", "MessageItem")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait MessageItemProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.undefined

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.undefined

    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandItem[MessageItem.MessageItemProps]] =
      js.undefined
  }

  def props(q: MessageItem): MessageItemProps =
    rawprops(
      q.as,
      q.child,
      q.className,
      q.clazz,
      q.content
    )

  def rawprops(
    as:        js.UndefOr[AsC]                                     = js.undefined,
    children:  js.UndefOr[VdomNode]                                = js.undefined,
    className: js.UndefOr[String]                                  = js.undefined,
    clazz:     js.UndefOr[Css]                                     = js.undefined,
    content:   js.UndefOr[VdomNode | MessageItem.MessageItemProps] = js.undefined
  ): MessageItemProps = {
    val p = (new js.Object).asInstanceOf[MessageItemProps]
    p.as        = as.toJs
    p.children  = children.toJs
    p.className = (className, clazz).toJs
    p.content   = content.toRaw
    p
  }

  private val component =
    JsComponent[MessageItemProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): MessageItem =
    new MessageItem(children = content)
}