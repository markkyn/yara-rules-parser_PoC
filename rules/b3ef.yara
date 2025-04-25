rule DetectBeef {
    meta:
        author="markkyn"
        description="it looks for beeeeeeef!"

    strings:
        $a = { B3 EF }

    condition:
        $a
}