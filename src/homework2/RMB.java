package homework2;

public class RMB {
    private Integer yuan;
    private Integer jiao;
    private Integer fen;

    public RMB() {
    }

    public RMB(Integer yuan, Integer jiao, Integer fen) {
        this.yuan = yuan;
        this.jiao = jiao;
        this.fen = fen;
    }

    public Integer getYuan() {
        return yuan;
    }

    public void setYuan(Integer yuan) {
        this.yuan = yuan;
    }

    public Integer getJiao() {
        return jiao;
    }

    public void setJiao(Integer jiao) {
        this.jiao = jiao;
    }

    public Integer getFen() {
        return fen;
    }

    public void setFen(Integer fen) {
        this.fen = fen;
    }
}
