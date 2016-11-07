To reproduce:

```
mvn clean package && java -jar target/jruby-test.jar src/main/ruby/test.rb
```
which prints:

```
SimpleClassImpl/5
SimpleClassImpl/5
NoMethodError: undefined method `set_value' for #<Java::FiRelex::BrokenClass::Builder:0x6fa0450e>
  <main> at src/main/ruby/test.rb:9
```

Which is kinda unexpected.

Whereas if we put the jruby-jar into boot classpath, everything works:

```
host% java -Xbootclasspath/a:`mvn dependency:build-classpath|grep -E ".*\.jar"` -classpath target/jruby-test.jar org.jruby.Main src/main/ruby/test.rb
SimpleClassImpl/5
SimpleClassImpl/5
BrokenClassImpl/5
BrokenClassImpl/5
```

This all can be accomplish by running `./run.sh`
