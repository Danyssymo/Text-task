package my_task.one.bean;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class TextFix {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;
    @Column(nullable = false)
    private String lang;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    @Column(columnDefinition = "TEXT")
    private String correctedText;
    @Column
    private String errorMsg;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLanguage() {
        return lang;
    }

    public void setLanguage(String language) {
        this.lang = language;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getCorrectedText() {
        return correctedText;
    }

    public void setCorrectedText(String correctedText) {
        this.correctedText = correctedText;
    }

    public String getErrorMessage() {
        return errorMsg;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMsg = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFix textFix = (TextFix) o;
        return Objects.equals(id, textFix.id) && Objects.equals(text, textFix.text) && Objects.equals(lang, textFix.lang) && status == textFix.status && Objects.equals(correctedText, textFix.correctedText) && Objects.equals(errorMsg, textFix.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, lang, status, correctedText, errorMsg);
    }

    @Override
    public String toString() {
        return "TextFix{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", lang='" + lang + '\'' +
                ", status=" + status +
                ", correctedText='" + correctedText + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
