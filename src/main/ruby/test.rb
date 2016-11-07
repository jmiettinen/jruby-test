# encoding: utf-8

[
Java::fi.relex::SimpleClass.builder().set_value(5).build(),
Java::fi.relex::SimpleClass.builder().setValue(5).build()
].each { |v| puts v.to_s }

[
Java::fi.relex::BrokenClass.builder().set_value(5).build(),
Java::fi.relex::BrokenClass.builder().setValue(5).build()
].each { |v| puts v.to_s }
