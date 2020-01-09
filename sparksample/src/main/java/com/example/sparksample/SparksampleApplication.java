package com.example.sparksample;

import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaPairInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SparksampleApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SparksampleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		SparkConf conf = new SparkConf()
                .setAppName("kafkaproject")
                .setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaStreamingContext ssc = new JavaStreamingContext(sc, new Duration(2000));

		/*
		 * Set<String> topics = Collections.singleton("nisum-topic1"); Map<String,
		 * String> kafkaParams = new HashMap<>();
		 * kafkaParams.put("metadata.broker.list", "localhost:9092");
		 */
        Map<String, Integer> topicmap=new HashMap<>(); 
        topicmap.put("nisum-topic1", 5);

		/*
		 * JavaPairInputDStream<String, String> directKafkaStream =
		 * KafkaUtils.createDirectStream(ssc, String.class, String.class,
		 * StringDecoder.class, StringDecoder.class, kafkaParams, topics);
		 * 
		 * directKafkaStream.foreachRDD(rdd -> { System.out.println("--- New RDD with "
		 * + rdd.partitions().size() + " partitions and " + rdd.count() + " records");
		 * rdd.foreach(record -> System.out.println(record._2)); });
		 */
        
        JavaPairInputDStream<String, String> directKafkaStream =KafkaUtils.createStream(ssc, "localhost:2181", "spark-streaming-consumer-group", topicmap);
        directKafkaStream.print(); 
        ssc.start(); 
		ssc.awaitTermination();
		

		
	}

}
