
JAVAC=/usr/bin/javac

.SUFFIXES: .java .class


SRCDIR=src
BINDIR=bin
DOCDIR=doc
JVM=java

SOURCES=$(shell find $(SRCDIR) -name '*.java' -type f)
CLASSES=$(SOURCES:$(SRCDIR)/%.java=$(BINDIR)/%.class) 

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(SRCDIR) $<


compile: $(CLASSES)


clean:
	rm $(BINDIR)/*.class

temp:
	echo $(CLASSES)

run:	
	$(JVM) -cp $(BINDIR) CleaningDishes 6 3 100 100

run1:	
	$(JVM) -cp $(BINDIR) CleaningDishes 4 2 100 100



docs:
	javadoc -d $(DOCDIR) $(SRCDIR)/*.java