package com.example.p6__k00278559;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class P6K00278559Application {

//    static List<String> myList = List.of("Alpha", "Beta", "Gamma");


    //Create a publisher that emits a single integer. Subscribe a subscriber that prints out the integer.
    static void task1( int i) {
        Mono.just(i).subscribe(System.out::println);
    }

    //Create a publisher that emits a sequence of words. Subscribe a subscriber that prints out all words
    //beginning with “A”. For a list of words [“Alpha”, “Beta”, “Gamma”], only “Alpha” would be printed out
    static void task2(List<String> words){
        Flux.fromIterable(words).filter(s -> s.startsWith("A")).subscribe(System.out::println);
    }

//    Create a publisher that emits a sequence of incrementing integers. The starting number is equal
//    to the method parameter “start”. The number of integers in the sequence is equal to the
//    method parameter “count”.
//    Create a subscriber that prints out the sum of all integers emitted from the publisher.
//    For a “start” of 1 and a “count” of 100, 5050 would be printed out.
    static void task3(int start, int count){
        Flux.range(start,count).subscribe(new Subscriber<Integer>() {
            private Subscription subscription;
            private int total = 0;
            @Override
            public void onSubscribe(Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(Integer integer) {
                total += integer;
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("task3 total is: "+ total);
            }
        });
    }

//    Create a publisher that emits a sequence of words. Subscribe two subscribers to the publisher.
//    The first subscriber should print out received words in upper case. The second subscriber
//    should print out received words in lower case.
//    For a list of words [“Alpha”, “Beta”, “Gamma”], the following should be printed out:
    static void task4(List<String> words){
        Flux<String> publisher = Flux.fromIterable(words);
        publisher.subscribe(s -> System.out.println(s.toUpperCase()));
        publisher.subscribe(s -> System.out.println(s.toLowerCase()));
    }

//    Create a publisher that emits a sequence of words. Subscribe a subscriber that prints out the
//    words as they are received.
//    Backpressure should be enabled, so that words are requested from the publisher 1 at a time.
//    If processing has completed successfully, the subscriber should print out “Completed!” (hint: the
//    subscriber onComplete() method is called after all elements have been processed successfully).
//    For a list of words [“Alpha”, “Beta”, “Gamma”], the following should be printed out:
    static void task5(List<String> words){
        Flux.fromIterable(words).subscribe(new Subscriber<String>() {
            private Subscription subscription;
            @Override
            public void onSubscribe(Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("Completed!!");
            }
        });
    }

    public static void main(String[] args) {
        List<String> myList = List.of("Alpha", "Beta", "Gamma");

        task1(9);
        task2(myList);
        task3(1,100);
        task4(myList);
        task5(myList);
    }
}

