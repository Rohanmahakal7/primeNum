package com.primeNumber.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {

	@GetMapping("/primes/{num}")
	public Output getPrimeNumber(@PathVariable int num) {

		Output o = new Output();
		List<Integer> l = new ArrayList<>();
		
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				l.add(i);
			}
		}
		o.setIntial(String.valueOf(num));
		o.setPrimes(l);
return o;
	}

	public static boolean isPrime(int number) {
		return !IntStream.rangeClosed(2, number / 2)
				.anyMatch(i -> number % i == 0);
	}

}
