package github.samankt.softscale

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SoftscaleApplication

fun main(args: Array<String>) {
	runApplication<SoftscaleApplication>(*args)
}
