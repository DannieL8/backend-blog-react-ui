var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":290,"methods":[{"el":44,"sc":5,"sl":39},{"el":51,"sc":5,"sl":47}],"name":"UserTest","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4":{"methods":[{"sl":39}],"name":"getUsers","pass":true,"statements":[{"sl":41},{"sl":43}]},"test_5":{"methods":[{"sl":47}],"name":"getOneUser","pass":true,"statements":[{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4], [], [4], [], [4], [], [], [], [5], [], [], [5], [], []]
