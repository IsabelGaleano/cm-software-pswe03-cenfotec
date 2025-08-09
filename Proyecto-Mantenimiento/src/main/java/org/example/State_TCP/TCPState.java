package org.example.State_TCP;

public interface TCPState {
    void open(TCPConnection connection);
    void close(TCPConnection connection);
}
