package exercicios.exercicio27.model.entities;

import java.time.LocalDateTime;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double totalValue;
    private Installment installment;

    public Contract() {
    }

    public Contract(Integer number, LocalDateTime date, Double totalValue, Installment installment) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installment = installment;
    }

    public Integer getNumber() {
        return number;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public Installment getInstallment() {
        return installment;
    }

}
