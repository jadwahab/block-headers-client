package com.nchain.headerSV.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author m.jose@nchain.com
 * Copyright (c) 2009-2010 Satoshi Nakamoto
 * Copyright (c) 2009-2016 The Bitcoin Core developers
 * Copyright (c) 2018-2020 Bitcoin Association
 * Distributed under the Open BSV software license, see the accompanying file LICENSE.
 * @date 05/08/2020
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockHeaderAddrDTO {
    private String address;

    private String hash;
}