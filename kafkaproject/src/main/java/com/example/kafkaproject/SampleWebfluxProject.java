package com.example.kafkaproject;

import java.util.Arrays;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class SampleWebfluxProject {
	
	public static void main(String args[]) {
	
	 Flux.just("Sushanth","Prakash","Susheela","Harika").subscribe(new Subscriber<String>() {

		@Override
		public void onSubscribe(Subscription s) {
			System.out.println("hi i am entering consumingggg");
			s.request(1000);
			//s.cancel();
			
		}

		@Override
		public void onNext(String t) {
			System.out.println("hi consuming"+t);
			
		}

		@Override
		public void onError(Throwable t) {
			System.out.println("while consuming i got error"+t);
			
		}

		@Override
		public void onComplete() {
			System.out.println("hi i am done with consuming");
			
		}
	})
	 
	 ;
	 
	 
	 
	 String[] strarr= {"Sushanth", "sai", "raj"};
	 
	 Flux.fromArray(strarr).subscribe(new Subscriber<String>() {

		@Override
		public void onSubscribe(Subscription s) {
			System.out.println("i am arry publisher");
			s.request(1000);
			
		}

		@Override
		public void onNext(String t) {
			System.out.println("haiiiii");
			
		}

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onComplete() {
			// TODO Auto-generated method stub
			
		}
	});
	 	
	 
	 Flux.fromIterable(Arrays.asList(strarr)).subscribe(new Subscriber<String>() {

		@Override
		public void onSubscribe(Subscription s) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onNext(String t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onComplete() {
			// TODO Auto-generated method stub
			
		}
	});
	 
	 
	 Mono.fromCallable(()->  "sushatn").subscribe(new Subscriber<String>() {

		@Override
		public void onSubscribe(Subscription s) {
			s.request(1);
			
		}

		@Override
		public void onNext(String t) {
			System.out.println("haiiiii"+t);
			
		}

		@Override
		public void onError(Throwable t) {
			System.out.println("i am error");
			
		}

		@Override
		public void onComplete() {
			System.out.println("i am completed");
			
		}
	});;  
	 
	}
}
