package com.java_8_training.examples.design.builder;

public class Message {
    private final Sender sender;
    private final String title;
    private final String content;

    private Message(Sender sender, String title, String content) {
        this.sender = sender;
        this.title = title;
        this.content = content;
    }

    public static MessageBuilder typeUnsafeBuilder() {
        return new MessageBuilder();
    }

    public static class MessageBuilder {
        private Sender sender;
        private String title;
        private String content;

        public MessageBuilder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        public MessageBuilder title(String title) {
            this.title = title;
            return this;
        }

        public MessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public Message build() {
            return new Message(sender, title, content);
        }
    }

    public static SenderBuilder builder() {
        return sender -> title -> content ->
                new MessageBuilder().sender(sender).title(title).content(content).build();
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public Sender getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
