package org.example.State_TCP;

public class OpenState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        connection.getLogger().log("Already open.");
    }
    @Override
    public void close(TCPConnection connection) {
        connection.getLogger().log("Closing connection...");
        connection.setState(new ClosedState());
    }
}
