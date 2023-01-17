#! /bin/sh

export REPLACEMENT=$1

mv ./assign01 ./assign$1
mv ./assign$1/src/main/java/edu/brandeis/rseg155f2019/assign01 ./assign$1/src/main/java/edu/brandeis/rseg155f2019/assign$1
mv ./assign$1/src/main/java/edu/brandeis/rseg155f2019/assign$1/Assign01Main.java ./assign$1/src/main/java/edu/brandeis/rseg155f2019/assign$1/Assign$1Main.java

mv ./live05 ./live$1
mv ./live$1/src/main/scala/edu/brandeis/rseg155f2019/live05 ./live$1/src/main/scala/edu/brandeis/rseg155f2019/live$1
mv ./live$1/src/main/scala/edu/brandeis/rseg155f2019/live$1/Live05Main.scala ./live$1/src/main/scala/edu/brandeis/rseg155f2019/live$1/Live$1Main.scala

find . -type f | xargs perl -p -i -e 's/ive05/ive$ENV{REPLACEMENT}/g';
find . -type f | xargs perl -p -i -e 's/sign01/sign$ENV{REPLACEMENT}/g';
