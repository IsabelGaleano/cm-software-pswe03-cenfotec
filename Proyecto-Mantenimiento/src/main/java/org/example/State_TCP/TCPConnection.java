package org.example.State_TCP;

import org.example.Logger.Logger;

public class TCPConnection {
    private TCPState state;
    private Logger logger;

    public TCPConnection(Logger logger) {
        this.logger = logger;
        this.state = new ClosedState();
    }

    public void setState(TCPState state) { this.state = state; }
    public Logger getLogger() { return logger; }

    public void open() { state.open(this); }
    public void close() { state.close(this); }
}
