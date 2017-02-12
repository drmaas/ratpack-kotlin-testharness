package ratpack.kotlin.test

import ratpack.kotlin.handling.ratpack

fun main(args: Array<String>) {
    ratpack {
        serverConfig {
            development(true)
            port(9000)
        }
        bindings {
            bindInstance("foobar")
        }
        handlers {
            get("test") {
                render("hello " + context.get(String::class.java))
            }
        }
    }
}
