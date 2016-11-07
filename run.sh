#!/usr/bin/env bash

mvn clean package

echo "--- This won't work properly as there's no JRuby in boot classpath"
java -jar target/jruby-test.jar src/main/ruby/test.rb

echo "--- But if we put the JRuby jar into both classpath, things work"
java -Xbootclasspath/a:`mvn dependency:build-classpath|grep -E ".*\.jar"` -classpath target/jruby-test.jar org.jruby.Main src/main/ruby/test.rb
