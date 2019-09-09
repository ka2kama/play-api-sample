package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

class HelloControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HelloController GET" should {

    "「/hello」にGETメソッドでアクセスできる" in {
      val request = FakeRequest(GET, "/hello")
      val home = route(app, request).get

      status(home) mustBe OK
    }
  }
}
