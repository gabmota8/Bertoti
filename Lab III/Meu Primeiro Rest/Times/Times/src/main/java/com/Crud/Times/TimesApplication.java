package com.Crud.Times;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimesApplication {
	public static void main(String[] args) {
		SpringApplication.run(TimesApplication.class, args);
	}

@RestController
@RequestMapping("/Times")
class RestApiDemoController {
	private List<Times> Times = new ArrayList<>();

	public RestApiDemoController() {
		Times.addAll(List.of(
				new Time("Real Madrid"),
				new Time ("Milan"),
				new Time("Liverpool"),
				new Time("Bayern Munchen")
		));
	}

	@GetMapping
	Iterable<Time> getTime() {
		return Time;
	}

	@GetMapping("/{id}")
	Optional<Time> getTimeById(@PathVariable String id) {
		for (Times c: Times) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Time postTime(@RequestBody Time time) {
		Times.add(Time);
		return coffee;
	}

	@PutMapping("/{id}")
	ResponseEntity<Time> putTime(@PathVariable String id,
									 @RequestBody Time  time) {
		int timeIndex = -1;

		for (Time c: Times) {
			if (c.getId().equals(id)) {
				TimeIndex = Times.indexOf(c);
				Times.set(TimeIndex, time);
			}
		}

		return (TimeIndex == -1) ?
				new ResponseEntity<>(postTime(time), HttpStatus.CREATED) :
				new ResponseEntity<>(time, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable String id) {
		Times.removeIf(c -> c.getId().equals(id));
	}
}

class Time {
	private final String id;
	private String name;

	public Time(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Time(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

	}