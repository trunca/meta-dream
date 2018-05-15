KV = "3.14-1.17"
DRIVERDATE = "20180514"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "ffeab80b6b52a16a38662a771b474bf8"
SRC_URI[dm920.sha256sum] = "3105ac19caf22657018b4cd7405364ed7c45d4147d6318f4a70abc8f69dd7f90"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
