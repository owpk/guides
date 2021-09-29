#!/bin/bash
# remove everything except specific word
echo echo "123 456 abc 111 abc 222 abc 333" | sed 's/[^abc]*\(abc.*\)/\1/'
