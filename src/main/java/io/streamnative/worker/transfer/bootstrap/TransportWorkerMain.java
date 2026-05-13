package io.streamnative.worker.transfer.bootstrap;

import java.time.Clock;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Worker 进程入口：装配 Clock、优雅停机钩子与基础运行标志。
 */
public final class TransportWorkerMain {

    private static final AtomicBoolean RUNNING = new AtomicBoolean(true);

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> RUNNING.set(false), "transport-shutdown"));
        Clock clock = Clock.systemUTC();
        long start = clock.millis();
        while (RUNNING.get()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
            if (clock.millis() - start > 5_000L) {
                break;
            }
        }
    }

    private TransportWorkerMain() {
    }
}
// bootstrap padding 0
// bootstrap padding 1
// bootstrap padding 2
// bootstrap padding 3
// bootstrap padding 4
// bootstrap padding 5
// bootstrap padding 6
// bootstrap padding 7
// bootstrap padding 8
// bootstrap padding 9
// bootstrap padding 10
// bootstrap padding 11
// bootstrap padding 12
// bootstrap padding 13
// bootstrap padding 14
// bootstrap padding 15
// bootstrap padding 16
// bootstrap padding 17
// bootstrap padding 18
// bootstrap padding 19
// bootstrap padding 20
// bootstrap padding 21
// bootstrap padding 22
// bootstrap padding 23
// bootstrap padding 24
// bootstrap padding 25
// bootstrap padding 26
// bootstrap padding 27
// bootstrap padding 28
// bootstrap padding 29
// bootstrap padding 30
// bootstrap padding 31
// bootstrap padding 32
// bootstrap padding 33
// bootstrap padding 34
// bootstrap padding 35
// bootstrap padding 36
// bootstrap padding 37
// bootstrap padding 38
// bootstrap padding 39
// bootstrap padding 40
// bootstrap padding 41
// bootstrap padding 42
// bootstrap padding 43
// bootstrap padding 44
// bootstrap padding 45
// bootstrap padding 46
// bootstrap padding 47
// bootstrap padding 48
// bootstrap padding 49
// bootstrap padding 50
// bootstrap padding 51
// bootstrap padding 52
// bootstrap padding 53
// bootstrap padding 54
// bootstrap padding 55
// bootstrap padding 56
// bootstrap padding 57
// bootstrap padding 58
// bootstrap padding 59
// bootstrap padding 60
// bootstrap padding 61
// bootstrap padding 62
// bootstrap padding 63
// bootstrap padding 64
// bootstrap padding 65
// bootstrap padding 66
// bootstrap padding 67
// bootstrap padding 68
// bootstrap padding 69
// bootstrap padding 70
// bootstrap padding 71
// bootstrap padding 72
// bootstrap padding 73
// bootstrap padding 74
// bootstrap padding 75
// bootstrap padding 76
// bootstrap padding 77
// bootstrap padding 78
// bootstrap padding 79
// bootstrap padding 80
// bootstrap padding 81
// bootstrap padding 82
// bootstrap padding 83
// bootstrap padding 84
