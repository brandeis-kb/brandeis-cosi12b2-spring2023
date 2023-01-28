#! /bin/bash

pushd $BRANDEIS_HOME

rm -rf  `find . -type f -name \.project`
rm -rf  `find . -type d -name \.settings`
rm -rf .idea
rm -rf `find . -type f -name \.DS_Store`

popd
