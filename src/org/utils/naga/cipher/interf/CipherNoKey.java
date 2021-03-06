package org.utils.naga.cipher.interf;

import org.utils.naga.excep.IrreversibleException;
import org.utils.naga.excep.StrategyException;

/**
 * <p>
 * 公共的加密工具接口（没有密钥的类型）
 * </p>
 * Create Date: 2016年4月22日
 * Last Modify: 2016年4月22日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public interface CipherNoKey extends Cipherable {

    /**
     * 加密
     * 
     * @param plaintext
     *      待加密明文
     * @return
     *      密文
     * @throws StrategyException 
     *      策略异常
     */
    public byte[] encryption(String plaintext) throws StrategyException;
    
    /**
     * 解密
     * 
     * @param ciphertext
     *      待解密密文
     * @return
     *      明文
     * @throws IrreversibleException 
     *      不可逆操作异常
     * @throws StrategyException 
     *      策略异常
     */
    public String decryption(byte[] ciphertext) throws IrreversibleException, StrategyException;
}
