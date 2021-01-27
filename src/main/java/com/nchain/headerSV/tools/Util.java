package com.nchain.headerSV.tools;

import com.nchain.jcl.base.domain.api.base.BlockHeader;
import com.nchain.jcl.base.tools.crypto.Sha256Wrapper;


import java.math.BigInteger;

/**
 * @author m.fletcher@nchain.com
 * Copyright (c) 2018-2020 Bitcoin Association
  * Copyright (c) 2018-2020 nChain Ltd
 * @date 04/08/2020
 */
public class Util {

    public static BigInteger decompressCompactBits(long targetBits){
        byte[] targetBitsByteArray = BigInteger.valueOf(targetBits).toByteArray();

        BigInteger index = new BigInteger(targetBitsByteArray, 0, 1);
        BigInteger coefficent = new BigInteger(targetBitsByteArray, 1, 3);

        return coefficent.multiply(BigInteger.valueOf(2).pow(BigInteger.valueOf(8).multiply(index.subtract(BigInteger.valueOf(3L))).intValue()));
    }

    public static BlockHeader GENESIS_BLOCK_HEADER_STNNET = BlockHeader.builder()
            .prevBlockHash(Sha256Wrapper.ZERO_HASH)
            .hash(Sha256Wrapper.wrap("000000000933ea01ad0ee984209779baaec3ced90fa3f408719526f8d77f4943"))
            .version(1)
            .merkleRoot(Sha256Wrapper.wrap("4a5e1e4baab89f3a32518a88c31bc87f618f76673e2cc77ab2127b7afdeda33b"))
            .difficultyTarget(0x1d00ffffL)
            .nonce(414098458)
            .numTxs(1)
            .time(1296688602L)
            .build();


    public static BlockHeader GENESIS_BLOCK_HEADER_MAINNET = BlockHeader.builder()
            .prevBlockHash(Sha256Wrapper.ZERO_HASH)
            .hash(Sha256Wrapper.wrap("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f"))
            .version(1)
            .merkleRoot(Sha256Wrapper.wrap("4a5e1e4baab89f3a32518a88c31bc87f618f76673e2cc77ab2127b7afdeda33b"))
            .difficultyTarget(486604799)
            .nonce(2083236893L)
            .numTxs(1L)
            .time(1231006505)
            .build();


    public static BlockHeader GENESIS_BLOCK_HEADER_TESTNET = BlockHeader.builder()
            .prevBlockHash(Sha256Wrapper.ZERO_HASH)
            .hash(Sha256Wrapper.wrap("000000000933ea01ad0ee984209779baaec3ced90fa3f408719526f8d77f4943"))
            .version(1)
            .merkleRoot(Sha256Wrapper.wrap("4a5e1e4baab89f3a32518a88c31bc87f618f76673e2cc77ab2127b7afdeda33b"))
            .difficultyTarget(486604799)
            .nonce(1924588547L)
            .numTxs(1)
            .time(1296688928)
            .build();

}
