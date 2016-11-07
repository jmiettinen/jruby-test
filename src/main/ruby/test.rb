# encoding: utf-8

[
Java::fi.relex::SimpleClass.instance.set_value(5),
Java::fi.relex::SimpleClass.instance.setValue(5)
].each { |v| puts v.to_s }

[
Java::fi.relex::BrokenClass.getBrokenInstance().set_value(5),
Java::fi.relex::BrokenClass.getBrokenInstance().setValue(5)
].each { |v| puts v.to_s }
