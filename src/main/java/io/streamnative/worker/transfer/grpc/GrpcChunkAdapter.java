package io.streamnative.worker.transfer.grpc;

import io.grpc.ManagedChannel;
import io.streamnative.worker.transfer.grpcgen.ChunkIngressGrpc;
import io.streamnative.worker.transfer.grpcgen.Chunk;
import io.streamnative.worker.transfer.grpcgen.ChunkAck;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;

/**
 * gRPC ChunkIngress 适配器：把字节块异步送往 sidecar / 边缘网关。
 */
public final class GrpcChunkAdapter {

    private final ManagedChannel channel;
    private final Executor executor;

    public GrpcChunkAdapter(ManagedChannel channel) {
        this(channel, ForkJoinPool.commonPool());
    }

    public GrpcChunkAdapter(ManagedChannel channel, Executor executor) {
        this.channel = Objects.requireNonNull(channel, "channel");
        this.executor = Objects.requireNonNull(executor, "executor");
    }

    public CompletableFuture<ChunkAck> pushAsync(byte[] body, String correlationId) {
        return CompletableFuture.supplyAsync(() -> {
            ChunkIngressGrpc.ChunkIngressBlockingStub stub = ChunkIngressGrpc.newBlockingStub(channel);
            Chunk req = Chunk.newBuilder()
                    .setBody(com.google.protobuf.ByteString.copyFrom(body))
                    .setCorrelationId(correlationId == null ? "" : correlationId)
                    .build();
            return stub.push(req);
        }, executor);
    }

    public byte[] extractDetailBytes(ChunkAck ack) {
        String d = ack.getDetail();
        return d == null ? new byte[0] : d.getBytes(StandardCharsets.UTF_8);
    }
}
// grpc-adapter-extra 0
// grpc-adapter-extra 1
// grpc-adapter-extra 2
// grpc-adapter-extra 3
// grpc-adapter-extra 4
// grpc-adapter-extra 5
// grpc-adapter-extra 6
// grpc-adapter-extra 7
// grpc-adapter-extra 8
// grpc-adapter-extra 9
// grpc-adapter-extra 10
// grpc-adapter-extra 11
// grpc-adapter-extra 12
// grpc-adapter-extra 13
// grpc-adapter-extra 14
// grpc-adapter-extra 15
// grpc-adapter-extra 16
// grpc-adapter-extra 17
// grpc-adapter-extra 18
// grpc-adapter-extra 19
// grpc-adapter-extra 20
// grpc-adapter-extra 21
// grpc-adapter-extra 22
// grpc-adapter-extra 23
// grpc-adapter-extra 24
// grpc-adapter-extra 25
// grpc-adapter-extra 26
// grpc-adapter-extra 27
// grpc-adapter-extra 28
// grpc-adapter-extra 29
// grpc-adapter-extra 30
// grpc-adapter-extra 31
// grpc-adapter-extra 32
// grpc-adapter-extra 33
// grpc-adapter-extra 34
// grpc-adapter-extra 35
// grpc-adapter-extra 36
// grpc-adapter-extra 37
// grpc-adapter-extra 38
// grpc-adapter-extra 39
// grpc-adapter-extra 40
// grpc-adapter-extra 41
// grpc-adapter-extra 42
// grpc-adapter-extra 43
// grpc-adapter-extra 44
// grpc-adapter-extra 45
// grpc-adapter-extra 46
// grpc-adapter-extra 47
// grpc-adapter-extra 48
// grpc-adapter-extra 49
// grpc-adapter-extra 50
// grpc-adapter-extra 51
// grpc-adapter-extra 52
// grpc-adapter-extra 53
// grpc-adapter-extra 54
// grpc-adapter-extra 55
// grpc-adapter-extra 56
// grpc-adapter-extra 57
// grpc-adapter-extra 58
// grpc-adapter-extra 59
// grpc-adapter-extra 60
// grpc-adapter-extra 61
// grpc-adapter-extra 62
// grpc-adapter-extra 63
// grpc-adapter-extra 64
// grpc-adapter-extra 65
// grpc-adapter-extra 66
// grpc-adapter-extra 67
// grpc-adapter-extra 68
// grpc-adapter-extra 69
// grpc-adapter-extra 70
// grpc-adapter-extra 71
// grpc-adapter-extra 72
// grpc-adapter-extra 73
// grpc-adapter-extra 74
// grpc-adapter-extra 75
// grpc-adapter-extra 76
// grpc-adapter-extra 77
// grpc-adapter-extra 78
// grpc-adapter-extra 79
// grpc-adapter-extra 80
// grpc-adapter-extra 81
// grpc-adapter-extra 82
// grpc-adapter-extra 83
// grpc-adapter-extra 84
// grpc-adapter-extra 85
// grpc-adapter-extra 86
// grpc-adapter-extra 87
// grpc-adapter-extra 88
// grpc-adapter-extra 89
