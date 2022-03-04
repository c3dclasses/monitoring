SHELL=/usr/bin/env bash -Eeuxo pipefail
.DEFAULT_GOALS := list

.PHONY: list
list: 
        @echo "hello, world!!!"
