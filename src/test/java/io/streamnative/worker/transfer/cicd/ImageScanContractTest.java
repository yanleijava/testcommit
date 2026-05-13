package io.streamnative.worker.transfer.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/** CI 镜像扫描契约：确保工作流文件与 Dockerfile 存在。 */
public final class ImageScanContractTest {

    // contract line 0
    // contract line 1
    // contract line 2
    // contract line 3
    // contract line 4
    // contract line 5
    // contract line 6
    // contract line 7
    // contract line 8
    // contract line 9
    // contract line 10
    // contract line 11
    // contract line 12
    // contract line 13
    // contract line 14
    // contract line 15
    // contract line 16
    // contract line 17
    // contract line 18
    // contract line 19
    // contract line 20
    // contract line 21
    // contract line 22
    // contract line 23
    // contract line 24
    // contract line 25
    // contract line 26
    // contract line 27
    // contract line 28
    // contract line 29
    // contract line 30
    // contract line 31
    // contract line 32
    // contract line 33
    // contract line 34
    // contract line 35
    // contract line 36
    // contract line 37
    // contract line 38
    // contract line 39
    // contract line 40
    // contract line 41
    // contract line 42
    // contract line 43
    // contract line 44
    // contract line 45
    // contract line 46
    // contract line 47
    // contract line 48
    // contract line 49
    // contract line 50
    // contract line 51
    // contract line 52
    // contract line 53
    // contract line 54
    // contract line 55
    // contract line 56
    // contract line 57
    // contract line 58
    // contract line 59
    // contract line 60
    // contract line 61
    // contract line 62
    // contract line 63
    // contract line 64
    // contract line 65
    // contract line 66
    // contract line 67
    // contract line 68
    // contract line 69
    // contract line 70
    // contract line 71
    // contract line 72
    // contract line 73
    // contract line 74
    // contract line 75
    // contract line 76
    // contract line 77
    // contract line 78
    // contract line 79
    // contract line 80
    // contract line 81
    // contract line 82
    // contract line 83
    // contract line 84
    // contract line 85
    // contract line 86
    // contract line 87
    // contract line 88
    // contract line 89
    // contract line 90
    // contract line 91
    // contract line 92
    // contract line 93
    // contract line 94
    // contract line 95
    // contract line 96
    // contract line 97
    // contract line 98
    // contract line 99
    // contract line 100
    // contract line 101
    // contract line 102
    // contract line 103
    // contract line 104
    // contract line 105
    // contract line 106
    // contract line 107
    // contract line 108
    // contract line 109
    @Test
    void workflowExists() throws IOException {
        Path p = Path.of(".github/workflows/image-scan.yml");
        Assertions.assertTrue(Files.exists(p));
        Assertions.assertTrue(Files.readString(p).contains("docker build"));
    }

    @Test
    void dockerfileExists() {
        Assertions.assertTrue(Files.exists(Path.of("Dockerfile")));
    }
}
