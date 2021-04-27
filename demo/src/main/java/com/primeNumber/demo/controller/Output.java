package com.primeNumber.demo.controller;

import java.util.List;

public class Output {

	private String intial;
	private List<Integer> primes;
	
	
	public String getIntial() {
		return intial;
	}
	public void setIntial(String intial) {
		this.intial = intial;
	}
	public List<Integer> getPrimes() {
		return primes;
	}
	public void setPrimes(List<Integer> primes) {
		this.primes = primes;
	}
	@Override
	public String toString() {
		return " [Intial=" + intial + ", Primes=" + primes + "]";
	}
	
}
